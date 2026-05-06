package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Crosshair: ImageVector
    get() {
        if (_crosshair != null) return _crosshair!!
        _crosshair = phosphorLightIcon(
            name = "Crosshair",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 122h-10.2C218.722 74.843 181.157 37.278 134 34.2v-10.2c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v10.2C74.843 37.278 37.278 74.843 34.2 122h-10.2c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10.2c3.078 47.157 40.643 84.722 87.8 87.8v10.2c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10.2c47.157-3.078 84.722-40.643 87.8-87.8h10.2c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM134 209.76v-9.76c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v9.76C81.476 206.739 49.261 174.524 46.24 134h9.76c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-9.76C49.261 81.476 81.476 49.261 122 46.24v9.76c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-9.76c40.524 3.021 72.739 35.236 75.76 75.76h-9.76c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h9.76c-3.021 40.524-35.236 72.739-75.76 75.76ZM128 90c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38C166 107.013 148.987 90 128 90ZM128 154c-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26Z"),
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
        return _crosshair!!
    }

private var _crosshair: ImageVector? = null
