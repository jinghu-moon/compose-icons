package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileVideoLine: ImageVector
    get() {
        if (_fileVideoLine != null) return _fileVideoLine!!
        _fileVideoLine = remixIcon(
            name = "FileVideoLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 4v4h4v12h-14v-16h10ZM3.999 2C3.447 2 3 2.444 3 2.992v18.016c0 .537 .445 .992 .993 .992h16.013c.549 0 .993-.451 .993-1.007L21 7 16 2h-12.001ZM15.001 11.667 10.122 8.414c-.066-.044-.143-.067-.222-.067-.221 0-.4 .179-.4 .4v6.505c0 .079 .023 .156 .067 .222 .123 .184 .371 .233 .555 .111l4.879-3.253c.044-.029 .082-.067 .111-.111 .123-.184 .073-.432-.111-.555Z"),
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
        return _fileVideoLine!!
    }

private var _fileVideoLine: ImageVector? = null
