package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MiniProgramFill: ImageVector
    get() {
        if (_miniProgramFill != null) return _miniProgramFill!!
        _miniProgramFill = remixIcon(
            name = "MiniProgramFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.841 12.691c-.022 .007-.044 .013-.066 .019-.136 .039-.276 .062-.414 .062-.61 0-.955-.412-.77-.921 .135-.372 .491-.686 .924-.831 .672-.245 1.142-.804 1.142-1.455 0-.877-.853-1.587-1.905-1.587-1.052 0-1.905 .711-1.905 1.587v4.868c0 1.171-.678 2.197-1.693 2.778-.553 .316-1.205 .503-1.905 .503-1.984 0-3.598-1.472-3.598-3.28 0-.576 .165-1.116 .451-1.587 .444-.729 1.184-1.287 2.07-1.541 .152-.047 .306-.073 .459-.073 .613 0 .959 .414 .773 .925-.126 .346-.465 .644-.861 .803-.047 .016-.093 .033-.139 .052-.628 .259-1.061 .798-1.061 1.422 0 .877 .853 1.587 1.905 1.587 1.052 0 1.905-.711 1.905-1.587v-4.868c0-1.171 .678-2.197 1.693-2.778 .553-.316 1.205-.503 1.905-.503 1.984 0 3.598 1.472 3.598 3.28 0 .576-.165 1.116-.451 1.587-.442 .725-1.177 1.282-2.058 1.538ZM2.001 12c0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10C22.001 6.477 17.524 2 12.001 2 6.478 2 2.001 6.477 2.001 12Z"),
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
        return _miniProgramFill!!
    }

private var _miniProgramFill: ImageVector? = null
