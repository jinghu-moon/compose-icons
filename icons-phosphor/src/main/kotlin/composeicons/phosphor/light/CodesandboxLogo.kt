package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorLightIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.72 67.91l-88-48.18c-4.182-2.31-9.258-2.31-13.44 0l-88 48.17C28.792 70.356 26.001 75.064 26 80.18v95.64c.001 5.116 2.792 9.824 7.28 12.28l88 48.17c4.183 2.306 9.257 2.306 13.44 0l88-48.17c4.488-2.456 7.279-7.164 7.28-12.28v-95.64c-.004-5.112-2.795-9.816-7.28-12.27ZM128 121.16 44.49 75.44 83.14 54.29l42 23c1.794 .982 3.966 .982 5.76 0l42-23 38.65 21.15ZM127 30.25c.598-.327 1.322-.327 1.92 0l31.4 17.2L128 65.16 95.63 47.45ZM38 175.82v-40l36 19.7v41.16L39 177.57c-.624-.36-1.006-1.029-1-1.75ZM86 203.28v-51.28c-.001-2.192-1.197-4.208-3.12-5.26L38 122.17v-36.6l84 46v91.43ZM134 223v-91.44l84-46v36.6l-44.88 24.57c-1.926 1.054-3.122 3.075-3.12 5.27v51.28ZM217 177.58l-35 19.14v-41.17l36-19.7v40c-.004 .71-.385 1.365-1 1.72Z"),
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
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
