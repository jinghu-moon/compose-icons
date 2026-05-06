package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = phosphorLightIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.72 225.82c-.482 1.517-1.548 2.781-2.962 3.513-1.414 .731-3.061 .871-4.578 .387L128 202.3 41.82 229.72c-3.159 1.005-6.535-.741-7.54-3.9-1.005-3.159 .741-6.535 3.9-7.54l70-22.28-70-22.28c-3.159-1.005-4.905-4.381-3.9-7.54 1.005-3.159 4.381-4.905 7.54-3.9L128 189.7l86.18-27.42c3.159-1.005 6.535 .741 7.54 3.9 1.005 3.159-.741 6.535-3.9 7.54l-70 22.28 70 22.28c1.517 .482 2.781 1.548 3.513 2.962 .731 1.414 .871 3.061 .387 4.578ZM70 108C70 61.19 122.62 28.27 124.86 26.89c1.926-1.183 4.354-1.183 6.28 0C133.38 28.27 186 61.19 186 108c0 32.033-25.967 58-58 58C95.967 166 70 140.033 70 108ZM128 154c9.941 0 18-8.059 18-18 0-15.48-12-27.43-18-32.44-6 5-18 17-18 32.44 0 9.941 8.059 18 18 18ZM82 108c.001 13.844 6.247 26.95 17 35.67-.664-2.503-1.001-5.081-1-7.67 0-26.9 25.58-44.27 26.67-45 2.016-1.345 4.644-1.345 6.66 0 1.09 .72 26.67 18.09 26.67 45 .001 2.589-.336 5.167-1 7.67 10.753-8.72 16.999-21.826 17-35.67C174 73.94 138.85 46.78 128 39.22 117.15 46.78 82 73.93 82 108Z"),
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
        return _campfire!!
    }

private var _campfire: ImageVector? = null
