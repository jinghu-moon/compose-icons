package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = phosphorFillIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 116.000 116.000 L 140.000 116.000 L 140.000 140.000 L 116.000 140.000 ZM 86.000 72.000 C 78.268 72.000 72.000 78.268 72.000 86.000 C 72.000 93.732 78.268 100.000 86.000 100.000 L 100.000 100.000 L 100.000 86.000 C 100.000 78.268 93.732 72.000 86.000 72.000 ZM 184.000 86.000 C 184.000 78.268 177.732 72.000 170.000 72.000 C 162.268 72.000 156.000 78.268 156.000 86.000 L 156.000 100.000 L 170.000 100.000 C 177.732 100.000 184.000 93.732 184.000 86.000 ZM 72.000 170.000 C 72.000 177.732 78.268 184.000 86.000 184.000 C 93.732 184.000 100.000 177.732 100.000 170.000 L 100.000 156.000 L 86.000 156.000 C 78.268 156.000 72.000 162.268 72.000 170.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 156.000 140.000 L 156.000 116.000 L 170.000 116.000 C 186.569 116.000 200.000 102.569 200.000 86.000 C 200.000 69.431 186.569 56.000 170.000 56.000 C 153.431 56.000 140.000 69.431 140.000 86.000 L 140.000 100.000 L 116.000 100.000 L 116.000 86.000 C 116.000 69.431 102.569 56.000 86.000 56.000 C 69.431 56.000 56.000 69.431 56.000 86.000 C 56.000 102.569 69.431 116.000 86.000 116.000 L 100.000 116.000 L 100.000 140.000 L 86.000 140.000 C 69.431 140.000 56.000 153.431 56.000 170.000 C 56.000 186.569 69.431 200.000 86.000 200.000 C 102.569 200.000 116.000 186.569 116.000 170.000 L 116.000 156.000 L 140.000 156.000 L 140.000 170.000 C 140.000 186.569 153.431 200.000 170.000 200.000 C 186.569 200.000 200.000 186.569 200.000 170.000 C 200.000 153.431 186.569 140.000 170.000 140.000 ZM 156.000 170.000 C 156.000 177.732 162.268 184.000 170.000 184.000 C 177.732 184.000 184.000 177.732 184.000 170.000 C 184.000 162.268 177.732 156.000 170.000 156.000 L 156.000 156.000 Z"),
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
        return _command!!
    }

private var _command: ImageVector? = null
