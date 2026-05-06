package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorDuotoneIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 128 58.32 230C56.826 228.541 55.989 226.538 56 224.45v-192.9c-.011-2.088 .826-4.091 2.32-5.55Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M239.82 114.18 72 18.16c-4.981-2.905-11.139-2.905-16.12 0C50.973 20.974 47.961 26.213 48 31.87v192.26c-.016 5.651 3.01 10.873 7.92 13.67 4.981 2.905 11.139 2.905 16.12 0l167.78-96c5.047-2.767 8.185-8.064 8.185-13.82 0-5.756-3.138-11.053-8.185-13.82ZM64 212.67v-169.34L148.69 128ZM160 139.31l18.92 18.92L90.42 208.89ZM90.4 47.1l88.53 50.67L160 116.69ZM193.31 150l-22-22 22-22 38.43 22Z"),
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
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
