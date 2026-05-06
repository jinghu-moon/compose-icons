package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberTwo: ImageVector
    get() {
        if (_numberTwo != null) return _numberTwo!!
        _numberTwo = phosphorFillIcon(
            name = "NumberTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-144C47.163 24 40 31.163 40 40v176c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM160 176c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-3.201-0-6.093-1.908-7.354-4.851-1.26-2.942-.645-6.353 1.564-8.669L145.9 120c8.231-9.93 7.142-24.59-2.465-33.195C133.827 78.201 119.136 78.728 110.17 88c-1.223 1.332-2.287 2.802-3.17 4.38-2.146 3.866-7.019 5.261-10.885 3.115C92.249 93.349 90.854 88.476 93 84.61c1.476-2.651 3.247-5.127 5.28-7.38 14.785-16.417 40.078-17.74 56.495-2.955 16.417 14.785 17.74 40.078 2.955 56.495l-.16 .16L114.66 176Z"),
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
        return _numberTwo!!
    }

private var _numberTwo: ImageVector? = null
