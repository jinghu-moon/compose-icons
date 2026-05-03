package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorFillIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 32.000 L 48.000 32.000 C 39.163 32.000 32.000 39.163 32.000 48.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 208.000 224.000 C 216.837 224.000 224.000 216.837 224.000 208.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 144.560 173.660 L 123.110 195.110 C 105.864 211.908 78.320 211.726 61.297 194.703 C 44.274 177.680 44.092 150.136 60.890 132.890 L 82.340 111.430 C 85.463 108.304 90.529 108.302 93.655 111.425 C 96.781 114.548 96.783 119.614 93.660 122.740 L 72.200 144.200 C 61.265 155.135 61.265 172.865 72.200 183.800 C 83.135 194.735 100.865 194.735 111.800 183.800 L 133.250 162.340 C 136.376 159.217 141.442 159.219 144.565 162.345 C 147.688 165.471 147.686 170.537 144.560 173.660 ZM 195.110 123.110 L 173.660 144.560 C 170.537 147.686 165.471 147.688 162.345 144.565 C 159.219 141.442 159.217 136.376 162.340 133.250 L 183.800 111.800 C 194.735 100.865 194.735 83.135 183.800 72.200 C 172.865 61.265 155.135 61.265 144.200 72.200 L 122.740 93.660 C 119.614 96.783 114.548 96.781 111.425 93.655 C 108.302 90.529 108.304 85.463 111.430 82.340 L 132.890 60.890 C 150.136 44.092 177.680 44.274 194.703 61.297 C 211.726 78.320 211.908 105.864 195.110 123.110 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
