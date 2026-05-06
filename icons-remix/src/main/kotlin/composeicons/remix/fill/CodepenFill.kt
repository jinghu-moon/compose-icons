package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CodepenFill: ImageVector
    get() {
        if (_codepenFill != null) return _codepenFill!!
        _codepenFill = remixIcon(
            name = "CodepenFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 10.202 9.303 12 12 13.798 14.697 12 12 10.202ZM16.5 10.798 19.197 9 13 4.869v3.596l3.5 2.333ZM20 10.868 18.303 12 20 13.132v-2.263ZM16.5 13.202 13 15.535v3.596L19.197 15 16.5 13.202ZM11 8.465v-3.596L4.803 9l2.697 1.798L11 8.465ZM4.803 15 11 19.132v-3.596L7.5 13.202 4.803 15ZM5.697 12 4 10.868v2.263L5.697 12ZM2 9c0-.334 .167-.647 .445-.832l9-6c.336-.224 .773-.224 1.109 0l9 6C21.833 8.353 22 8.666 22 9v6c0 .334-.167 .647-.445 .832l-9 6c-.336 .224-.773 .224-1.109 0l-9-6C2.167 15.647 2 15.334 2 15v-6Z"),
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
        return _codepenFill!!
    }

private var _codepenFill: ImageVector? = null
