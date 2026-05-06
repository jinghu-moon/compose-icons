package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorRegularIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 80c0-4.418 3.582-8 8-8h64c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-64c-4.418 0-8-3.582-8-8ZM136 158c0 23.196-18.804 42-42 42h-62c-4.418 0-8-3.582-8-8v-128c0-4.418 3.582-8 8-8h58c15.66 .017 29.706 9.638 35.379 24.235 5.673 14.596 1.81 31.178-9.729 41.765 12.63 7.598 20.354 21.261 20.35 36ZM40 116h50c12.15 0 22-9.85 22-22C112 81.85 102.15 72 90 72h-50ZM120 158c0-14.359-11.641-26-26-26h-54v52h54c14.359 0 26-11.641 26-26ZM248 152c0 4.418-3.582 8-8 8h-71c3.073 11.913 12.704 21.009 24.773 23.397 12.069 2.389 24.438-2.353 31.817-12.197 2.654-3.535 7.67-4.249 11.205-1.595 3.535 2.654 4.249 7.67 1.595 11.205-14.131 18.828-39.83 24.629-60.679 13.698C156.862 183.577 147.018 159.139 154.466 136.808c7.449-22.331 29.993-35.965 53.229-32.191 23.236 3.774 40.306 23.842 40.305 47.382ZM231 144c-3.625-14.159-16.384-24.063-31-24.063-14.616 0-27.375 9.903-31 24.063Z"),
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
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
