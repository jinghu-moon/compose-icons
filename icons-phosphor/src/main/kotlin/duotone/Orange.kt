package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Orange: ImageVector
    get() {
        if (_orange != null) return _orange!!
        _orange = phosphorDuotoneIcon(
            name = "Orange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 152.000 C 208.000 196.183 172.183 232.000 128.000 232.000 C 83.817 232.000 48.000 196.183 48.000 152.000 C 48.000 107.817 83.817 72.000 128.000 72.000 C 172.183 72.000 208.000 107.817 208.000 152.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 165.870 72.580 C 186.846 61.495 199.978 39.725 200.000 16.000 C 200.000 11.582 196.418 8.000 192.000 8.000 L 184.000 8.000 C 160.708 8.009 139.260 20.671 128.000 41.060 C 116.740 20.671 95.292 8.009 72.000 8.000 L 64.000 8.000 C 59.582 8.000 56.000 11.582 56.000 16.000 C 56.000 20.418 59.582 24.000 64.000 24.000 L 72.000 24.000 C 95.572 24.032 115.645 41.149 119.400 64.420 C 75.609 68.706 41.714 104.678 40.036 148.647 C 38.359 192.616 69.415 231.065 112.753 238.675 C 156.090 246.285 198.388 220.716 211.791 178.807 C 225.193 136.897 205.581 91.529 165.870 72.580 ZM 183.330 24.000 C 179.437 46.829 159.826 63.641 136.670 64.000 C 140.563 41.171 160.174 24.359 183.330 24.000 ZM 128.000 224.000 C 88.235 224.000 56.000 191.764 56.000 152.000 C 56.000 112.235 88.235 80.000 128.000 80.000 C 167.764 80.000 200.000 112.235 200.000 152.000 C 199.956 191.746 167.746 223.956 128.000 224.000 ZM 183.890 161.320 C 179.675 185.077 161.077 203.675 137.320 207.890 C 136.884 207.961 136.442 207.998 136.000 208.000 C 131.841 207.994 128.381 204.802 128.039 200.657 C 127.697 196.513 130.588 192.797 134.690 192.110 C 151.741 189.080 165.090 175.731 168.120 158.680 C 168.884 154.358 172.989 151.459 177.318 152.183 C 181.647 152.907 184.584 156.984 183.900 161.320 Z"),
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
        return _orange!!
    }

private var _orange: ImageVector? = null
