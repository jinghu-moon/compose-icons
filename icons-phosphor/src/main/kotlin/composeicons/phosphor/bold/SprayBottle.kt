package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) return _sprayBottle!!
        _sprayBottle = phosphorBoldIcon(
            name = "SprayBottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 84c6.627 0 12-5.373 12-12C211.961 38.879 185.121 12.039 152 12h-72C68.954 12 60 20.954 60 32v48c0 11.046-8.954 20-20 20-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 22.74-.027 41.725-17.356 43.82-40h24.18v20.62c.012 6.08-2.754 11.832-7.51 15.62L84.51 133C74.044 141.337 67.963 154 68 167.38v56.62c0 11.046 8.954 20 20 20h104c11.046 0 20-8.954 20-20v-12.53C212.011 167.074 201.265 123.336 180.68 84ZM84 36h68c15.256 0 28.855 9.617 33.94 24h-101.94ZM188 211.47v8.53h-96v-52.62c-.012-6.08 2.754-11.832 7.51-15.62l16-12.78c10.453-8.336 16.526-20.99 16.49-34.36v-20.62h21.24c22.766 38.622 34.769 82.638 34.76 127.47Z"),
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
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
