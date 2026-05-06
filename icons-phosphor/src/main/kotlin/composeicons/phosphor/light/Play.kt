package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorLightIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.36 116.19 87.28 28.06C82.952 25.405 77.526 25.302 73.1 27.79 68.696 30.209 65.971 34.846 66 39.87v176.26c-.029 5.024 2.696 9.661 7.1 12.08 4.426 2.488 9.852 2.385 14.18-.27L231.36 139.81c4.125-2.507 6.643-6.984 6.643-11.81 0-4.826-2.518-9.303-6.643-11.81ZM225.1 129.57 81 217.7c-.634 .381-1.426 .381-2.06 0-.615-.3-1.004-.926-1-1.61v-176.22c-.004-.684 .385-1.31 1-1.61 .324-.18 .69-.27 1.06-.26 .355 .013 .7 .12 1 .31l144.1 88.12c.557 .327 .899 .924 .899 1.57 0 .646-.342 1.243-.899 1.57Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
