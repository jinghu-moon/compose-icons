package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) return _microsoftTeamsLogo!!
        _microsoftTeamsLogo = phosphorThinIcon(
            name = "MicrosoftTeamsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 104c0 2.209-1.791 4-4 4h-12v44c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-44h-12c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM228 92.74v59.26c.002 19.666-15.777 35.694-35.44 36-8.479 23.968-31.142 39.99-56.565 39.99C110.572 227.99 87.909 211.968 79.43 188h-39.43c-6.627 0-12-5.373-12-12v-96C28 73.373 33.373 68 40 68h62.07C95.785 49.954 104.695 30.142 122.366 22.869c17.671-7.273 37.945 .529 46.184 17.771 12.037-7.881 28.088-5.356 37.125 5.839 9.037 11.195 8.118 27.417-2.125 37.521h15.69c2.321-.003 4.547 .917 6.19 2.556 1.643 1.639 2.567 3.864 2.57 6.184ZM171.23 48.61C174.008 61.835 169.146 75.501 158.64 84h25.36c8.823 .001 16.605-5.78 19.152-14.228 2.547-8.448-.744-17.567-8.098-22.442-7.354-4.875-17.034-4.355-23.824 1.28ZM110.71 68h25.29c6.627 0 12 5.373 12 12v1.29c10.234-4.853 16.537-15.393 15.968-26.705C163.4 43.273 156.072 33.417 145.403 29.615c-10.669-3.802-22.578-.803-30.173 7.6-7.595 8.403-9.379 20.553-4.521 30.785ZM40 180h96c2.209 0 4-1.791 4-4v-96c0-2.209-1.791-4-4-4h-96c-2.209 0-4 1.791-4 4v96c0 2.209 1.791 4 4 4ZM188 168v-72c0-2.209-1.791-4-4-4h-36v84c0 6.627-5.373 12-12 12h-48c9.534 22.881 33.892 35.851 58.198 30.99C170.504 214.129 188 192.787 188 168ZM220 92.74c0-.409-.331-.74-.74-.74h-24c.463 1.283 .7 2.636 .7 4v72c-0 3.983-.396 7.955-1.18 11.86C209.096 178.432 219.999 166.387 220 152Z"),
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
        return _microsoftTeamsLogo!!
    }

private var _microsoftTeamsLogo: ImageVector? = null
