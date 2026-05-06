package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) return _microsoftPowerpointLogo!!
        _microsoftPowerpointLogo = phosphorThinIcon(
            name = "MicrosoftPowerpointLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 100h-16c-2.209 0-4 1.791-4 4v48c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12h12c11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20ZM96 132h-12v-24h12c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM136 28C104.535 28.047 74.916 42.857 56 68h-16C33.373 68 28 73.373 28 80v96c0 6.627 5.373 12 12 12h16c28.216 37.621 78.832 50.499 121.596 30.938 42.765-19.561 66.122-66.276 56.112-112.224C223.698 60.766 183.026 28 136 28ZM227.91 124h-71.91v-44c0-6.627-5.373-12-12-12h-4v-31.91c47.638 2.136 85.774 40.272 87.91 87.91ZM132 36.1v31.9h-65.74C82.856 48.782 106.633 37.244 132 36.1ZM36 176v-96c0-2.209 1.791-4 4-4h104c2.209 0 4 1.791 4 4v96c0 2.209-1.791 4-4 4h-104c-2.209 0-4-1.791-4-4ZM66.26 188h65.74v31.9C106.633 218.756 82.856 207.218 66.26 188ZM140 219.91v-31.91h4c6.627 0 12-5.373 12-12v-44h71.91c-2.136 47.638-40.272 85.774-87.91 87.91Z"),
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
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
