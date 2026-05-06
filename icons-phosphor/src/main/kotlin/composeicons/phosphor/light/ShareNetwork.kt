package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShareNetwork: ImageVector
    get() {
        if (_shareNetwork != null) return _shareNetwork!!
        _shareNetwork = phosphorLightIcon(
            name = "ShareNetwork",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 162c-10.808-.004-21.104 4.606-28.3 12.67L98.8 143.24c4.267-9.712 4.267-20.768 0-30.48L147.7 81.33c13.23 14.757 35.58 16.868 51.339 4.849 15.759-12.019 19.634-34.132 8.9-50.794C197.206 18.723 175.47 13.109 158.01 22.489c-17.459 9.38-24.778 30.603-16.81 48.751L92.3 102.67C81.797 90.925 65.136 86.879 50.416 92.501 35.697 98.122 25.973 112.244 25.973 128c0 15.756 9.723 29.878 24.443 35.499 14.719 5.621 31.381 1.576 41.884-10.169l48.9 31.43c-6.741 15.398-2.565 33.396 10.268 44.252 12.833 10.856 31.274 11.991 45.342 2.791 14.068-9.201 20.419-26.55 15.617-42.659C207.624 173.035 192.809 161.996 176 162ZM176 30c14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26C161.641 82 150 70.359 150 56c0-14.359 11.641-26 26-26ZM64 154C49.641 154 38 142.359 38 128c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26ZM176 226c-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26Z"),
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
        return _shareNetwork!!
    }

private var _shareNetwork: ImageVector? = null
