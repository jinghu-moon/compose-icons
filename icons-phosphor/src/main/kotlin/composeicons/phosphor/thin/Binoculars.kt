package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = phosphorThinIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.22 148.09 189.6 53.41c-.197-.455-.479-.869-.83-1.22-5.251-5.252-12.373-8.202-19.8-8.202-7.427 0-14.549 2.95-19.8 8.202-.745 .746-1.166 1.756-1.17 2.81v29h-40v-29c.001-1.061-.42-2.079-1.17-2.83C101.579 46.918 94.457 43.968 87.03 43.968c-7.427 0-14.549 2.95-19.8 8.202-.351 .351-.633 .765-.83 1.22L24.78 148.09c-8.257 16.238-5.655 35.884 6.545 49.412 12.2 13.528 31.474 18.139 48.476 11.598C96.802 202.558 108.014 186.216 108 168v-76h40v76c-.014 18.216 11.198 34.558 28.199 41.1 17.001 6.542 36.276 1.93 48.476-11.598 12.2-13.528 14.802-33.175 6.545-49.412ZM64 204C44.118 204 28 187.882 28 168c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36ZM64 124c-7.987-.006-15.823 2.172-22.66 6.3L73.4 57.35C80.831 50.429 92.269 50.175 100 56.76v86C91.774 131.014 78.34 124.013 64 124ZM156 56.77c7.731-6.585 19.169-6.331 26.6 .59l32.06 72.94C194.878 118.377 169.24 123.814 156 142.74ZM192 204c-19.882 0-36-16.118-36-36 0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
