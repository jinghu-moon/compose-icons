package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FlowerLine: ImageVector
    get() {
        if (_flowerLine != null) return _flowerLine!!
        _flowerLine = remixIcon(
            name = "FlowerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2.076l.455 .233c1.766 .903 3.278 2.229 4.402 3.846 .928-.441 1.921-.766 2.962-.957L21 4.981v8.019C21 17.97 16.971 22 12 22 7.029 22 3 17.971 3 13v-8.019l1.181 .217c1.04 .191 2.034 .516 2.962 .957C8.267 4.538 9.779 3.211 11.545 2.309l.455-.233ZM8.878 7.165c1.23 .861 2.29 1.948 3.122 3.199 .832-1.252 1.893-2.338 3.122-3.199C14.295 6.016 13.23 5.049 12 4.337 10.77 5.049 9.705 6.016 8.878 7.165ZM10.899 12.434C10.018 10.72 8.656 9.293 6.991 8.332 6.367 7.972 5.7 7.677 5 7.457v5.543c0 3.29 2.27 6.05 5.328 6.799C10.114 18.9 10 17.963 10 17c0-1.617 .32-3.159 .899-4.566ZM12.453 19.986C16.108 19.752 19 16.714 19 13v-5.543c-.7 .22-1.367 .515-1.991 .875C14.013 10.062 12 13.296 12 17c0 1.041 .159 2.044 .453 2.986Z"),
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
        return _flowerLine!!
    }

private var _flowerLine: ImageVector? = null
