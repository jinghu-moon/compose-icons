package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorLightIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196.55 64.09C185.21 36.202 158.106 17.963 128 17.963c-30.106 0-57.21 18.239-68.55 46.127C34.253 75.264 18.006 100.236 18 127.8 17.9 164.91 49.13 197 86.19 198c12.511 .292 24.873-2.759 35.81-8.84v42.84c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-42.84c10.399 5.785 22.1 8.827 34 8.84h1.77c37.1-1 68.33-33.1 68.23-70.2C237.994 100.236 221.747 75.264 196.55 64.09ZM169.5 186c-12.721 .335-25.198-3.531-35.5-11v-43.29l44.68-22.34c2.966-1.48 4.17-5.084 2.69-8.05-1.48-2.966-5.084-4.17-8.05-2.69L134 118.29v-30.29c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v54.29L82.68 122.63c-2.966-1.48-6.57-.276-8.05 2.69-1.48 2.966-.276 6.57 2.69 8.05L122 155.71v19.29c-10.309 7.455-22.781 11.32-35.5 11C55.79 185.23 29.92 158.6 30 127.86 29.999 104.213 44.406 82.952 66.37 74.19c1.576-.637 2.808-1.913 3.39-3.51C78.691 46.217 101.958 29.943 128 29.943c26.042 0 49.309 16.274 58.24 40.737 .582 1.597 1.814 2.873 3.39 3.51 21.955 8.756 36.362 30.003 36.37 53.64 .08 30.75-25.79 57.37-56.5 58.17Z"),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
