package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Storefront: ImageVector
    get() {
        if (_storefront != null) return _storefront!!
        _storefront = phosphorLightIcon(
            name = "Storefront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M26.22 94.41c-.144 .518-.218 1.053-.22 1.59v16c-.005 12.316 5.958 23.87 16 31v73c0 3.314 2.686 6 6 6h160c3.314 0 6-2.686 6-6v-73c10.042-7.13 16.005-18.684 16-31v-16c.001-.555-.077-1.107-.23-1.64L215.43 44.15C213.694 38.166 208.23 34.037 202 34h-148c-6.23 .037-11.694 4.166-13.43 10.15ZM52.11 47.41C52.366 46.579 53.13 46.009 54 46h148c.892 .001 1.675 .593 1.92 1.45L216.05 90h-176.05ZM102 102h52v10c0 14.359-11.641 26-26 26-14.359 0-26-11.641-26-26ZM38 102h52v10c.01 9.127-4.766 17.591-12.584 22.301-7.818 4.71-17.533 4.975-25.596 .699-.492-.42-1.05-.758-1.65-1C42.602 129.246 38.006 120.938 38 112ZM202 210h-148v-61.34c16.039 4.364 33.052-2.203 42-16.21 6.969 10.931 19.036 17.549 32 17.549 12.964 0 25.031-6.618 32-17.549 8.948 14.007 25.962 20.574 42 16.21ZM205.83 134c-.6 .242-1.158 .58-1.65 1-8.063 4.276-17.778 4.01-25.596-.699C170.766 129.591 165.99 121.127 166 112v-10h52v10c-.006 8.938-4.602 17.246-12.17 22Z"),
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
