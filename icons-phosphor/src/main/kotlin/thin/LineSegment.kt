package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorThinIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 211.810 44.190 C 201.431 33.772 184.761 33.158 173.644 42.785 C 162.527 52.412 160.752 68.999 169.580 80.760 L 80.760 169.580 C 69.611 161.244 54.031 162.365 44.190 172.210 L 44.190 172.210 C 33.633 182.786 33.241 199.788 43.299 210.839 C 53.358 221.890 70.321 223.095 81.841 213.577 C 93.361 204.059 95.376 187.172 86.420 175.210 L 175.240 86.390 C 187.001 95.218 203.588 93.443 213.215 82.326 C 222.842 71.209 222.228 54.539 211.810 44.160 ZM 78.140 206.190 C 72.421 211.911 63.818 213.623 56.343 210.528 C 48.869 207.433 43.996 200.140 43.996 192.050 C 43.996 183.960 48.869 176.667 56.343 173.572 C 63.818 170.477 72.421 172.189 78.140 177.910 C 85.921 185.715 85.921 198.345 78.140 206.150 ZM 206.140 78.190 C 198.330 85.998 185.670 85.998 177.860 78.190 L 177.860 78.190 C 172.139 72.471 170.427 63.868 173.522 56.393 C 176.617 48.919 183.910 44.046 192.000 44.046 C 200.090 44.046 207.383 48.919 210.478 56.393 C 213.573 63.868 211.861 72.471 206.140 78.190 Z"),
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
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
