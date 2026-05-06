package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorThinIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M171.17 84.82C165.423 46.163 131.294 18.166 92.259 20.088 53.224 22.01 22.01 53.224 20.088 92.259c-1.922 39.035 26.074 73.164 64.732 78.911 5.747 38.657 39.876 66.654 78.911 64.732 39.035-1.922 70.249-33.136 72.171-72.171C237.824 124.696 209.827 90.567 171.17 84.82ZM228 160c-.005 4.387-.43 8.764-1.27 13.07L169.39 115.73C171.121 109.296 171.999 102.663 172 96c0-1 0-2-.07-2.94C204.416 98.762 228.083 127.018 228 160ZM146.81 152.46l58.33 58.34c-6.741 5.998-14.607 10.597-23.14 13.53L124.22 166.55c8.297-3.337 15.943-8.107 22.59-14.09ZM152.46 146.81c5.984-6.65 10.754-14.299 14.09-22.6L224.33 182c-2.932 8.537-7.531 16.406-13.53 23.15ZM28 96C28 58.445 58.445 28 96 28c37.555 0 68 30.445 68 68 0 37.555-30.445 68-68 68C58.461 163.961 28.039 133.539 28 96ZM93.06 171.93c1 0 2 .07 2.94 .07 6.663-.001 13.296-.879 19.73-2.61l57.34 57.34c-4.306 .84-8.683 1.265-13.07 1.27-32.982 .083-61.238-23.584-66.94-56.07Z"),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null
