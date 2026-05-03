package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowElbowRightDown: ImageVector
    get() {
        if (_arrowElbowRightDown != null) return _arrowElbowRightDown!!
        _arrowElbowRightDown = phosphorThinIcon(
            name = "ArrowElbowRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 226.830 162.830 L 178.830 210.830 C 178.080 211.581 177.062 212.003 176.000 212.003 C 174.938 212.003 173.920 211.581 173.170 210.830 L 125.170 162.830 C 123.607 161.267 123.607 158.733 125.170 157.170 C 126.733 155.607 129.267 155.607 130.830 157.170 L 172.000 198.340 L 172.000 68.000 L 32.000 68.000 C 29.791 68.000 28.000 66.209 28.000 64.000 C 28.000 61.791 29.791 60.000 32.000 60.000 L 176.000 60.000 C 178.209 60.000 180.000 61.791 180.000 64.000 L 180.000 198.340 L 221.170 157.170 C 222.733 155.607 225.267 155.607 226.830 157.170 C 228.393 158.733 228.393 161.267 226.830 162.830 Z"),
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
        return _arrowElbowRightDown!!
    }

private var _arrowElbowRightDown: ImageVector? = null
