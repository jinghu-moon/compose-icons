package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorThinIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M28.15 95c-.094 .325-.145 .661-.15 1v16c.004 12.019 6.007 23.243 16 29.92v74.08c0 2.209 1.791 4 4 4h160c2.209 0 4-1.791 4-4v-74.08c9.993-6.677 15.996-17.901 16-29.92v-16c-.004-.366-.062-.73-.17-1.08L213.5 44.7C212.031 39.563 207.343 36.017 202 36h-148c-5.343 .017-10.031 3.563-11.5 8.7ZM50.15 46.92C50.634 45.194 52.207 44.001 54 44h148c1.783 .003 3.35 1.185 3.84 2.9L218.7 92h-181.4ZM100 100h56v12c0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28ZM36 112v-12h56v12c-.004 9.872-5.207 19.013-13.693 24.057-8.486 5.044-19.002 5.247-27.677 .533-.384-.334-.829-.592-1.31-.76C41.046 130.736 36.005 121.716 36 112ZM204 212h-152v-66.06c16.974 5.994 35.766-1.472 44-17.48 6.174 11.98 18.523 19.508 32 19.508 13.477 0 25.826-7.528 32-19.508 8.234 16.008 27.026 23.474 44 17.48ZM206.68 135.83c-.478 .167-.92 .425-1.3 .76-8.675 4.719-19.194 4.519-27.684-.526C169.206 131.019 164.002 121.875 164 112v-12h56v12c-.005 9.716-5.046 18.736-13.32 23.83Z"),
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
        return _storefront!!
    }

private var _storefront: ImageVector? = null
