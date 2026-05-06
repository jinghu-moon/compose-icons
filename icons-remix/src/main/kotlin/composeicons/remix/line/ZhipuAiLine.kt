package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ZhipuAiLine: ImageVector
    get() {
        if (_zhipuAiLine != null) return _zhipuAiLine!!
        _zhipuAiLine = remixIcon(
            name = "ZhipuAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.531 3.015C19.918 3.156 21 4.326 21 5.75v12.5l-.015 .281C20.844 19.918 19.674 21 18.25 21h-12.5C4.231 21 3 19.769 3 18.25v-12.5C3 4.326 4.082 3.156 5.469 3.015L5.75 3h12.5l.281 .015ZM5.75 5C5.336 5 5 5.336 5 5.75v12.5c0 .414 .336 .75 .75 .75h12.5c.414 0 .75-.336 .75-.75v-12.5C19 5.336 18.664 5 18.25 5h-12.5ZM10.763 17.268h-4.954L13.24 6.739h4.954L10.763 17.268ZM17.882 17.268h-6.193l.873-1.238c.133-.193 .359-.312 .599-.313h4.722v1.551ZM12.314 6.739l-.865 1.232c-.133 .193-.36 .312-.6 .312h-4.729v-1.551c.012 .007 6.185 .006 6.193 .006Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _zhipuAiLine!!
    }

private var _zhipuAiLine: ImageVector? = null
