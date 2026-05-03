package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) return _linkSimpleBreak!!
        _linkSimpleBreak = phosphorThinIcon(
            name = "LinkSimpleBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 212.790 116.770 L 182.720 146.830 C 181.157 148.393 178.623 148.393 177.060 146.830 C 175.497 145.267 175.497 142.733 177.060 141.170 L 207.130 111.110 C 224.317 93.923 224.317 66.057 207.130 48.870 C 189.943 31.683 162.077 31.683 144.890 48.870 L 114.820 78.930 C 113.246 80.423 110.769 80.389 109.237 78.854 C 107.704 77.318 107.674 74.841 109.170 73.270 L 139.230 43.210 C 159.543 22.897 192.477 22.897 212.790 43.210 C 233.103 63.523 233.103 96.457 212.790 116.770 ZM 141.170 177.060 L 111.110 207.130 C 93.923 224.317 66.057 224.317 48.870 207.130 C 31.683 189.943 31.683 162.077 48.870 144.890 L 78.930 114.830 C 80.493 113.267 80.493 110.733 78.930 109.170 C 77.367 107.607 74.833 107.607 73.270 109.170 L 43.210 139.230 C 22.897 159.543 22.897 192.477 43.210 212.790 C 63.523 233.103 96.457 233.103 116.770 212.790 L 146.830 182.720 C 148.393 181.157 148.393 178.623 146.830 177.060 C 145.267 175.497 142.733 175.497 141.170 177.060 Z"),
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
