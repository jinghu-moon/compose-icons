package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Link: ImageVector
    get() {
        if (_link != null) return _link!!
        _link = phosphorFillIcon(
            name = "Link",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM115.7 192.49c-18.474 12.592-43.496 9.053-57.753-8.167C43.689 167.102 44.882 141.859 60.7 126.06L86.07 100.69c16.923-16.892 44.327-16.892 61.25 0 4.391 4.365 7.786 9.629 9.95 15.43 1.546 4.142-.558 8.754-4.7 10.3-4.142 1.546-8.754-.558-10.3-4.7-3.267-8.693-10.724-15.133-19.801-17.098-9.076-1.965-18.53 .814-25.099 7.378L72 137.37c-9.965 9.966-10.715 25.877-1.73 36.735 8.985 10.858 24.755 13.1 36.41 5.175 2.356-1.762 5.489-2.088 8.158-.85 2.669 1.238 4.443 3.842 4.618 6.779 .176 2.937-1.275 5.733-3.777 7.281ZM195.31 129.94l-25.37 25.37c-8.101 8.152-19.128 12.722-30.62 12.69h0c-18.046-.024-34.19-11.224-40.53-28.12-1.546-4.142 .558-8.754 4.7-10.3 4.142-1.546 8.754 .558 10.3 4.7 3.996 10.624 14.139 17.675 25.49 17.72h0c7.25 .021 14.207-2.86 19.32-8L184 118.63c9.965-9.966 10.715-25.877 1.73-36.735C176.745 71.037 160.975 68.795 149.32 76.72c-2.356 1.762-5.489 2.088-8.158 .85-2.669-1.238-4.443-3.842-4.618-6.779-.176-2.937 1.275-5.733 3.777-7.281 18.475-12.527 43.444-8.965 57.679 8.229 14.235 17.193 13.075 42.389-2.679 58.201Z"),
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
        return _link!!
    }

private var _link: ImageVector? = null
