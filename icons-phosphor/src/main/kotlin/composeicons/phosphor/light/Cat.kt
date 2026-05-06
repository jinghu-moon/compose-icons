package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cat: ImageVector
    get() {
        if (_cat != null) return _cat!!
        _cat = phosphorLightIcon(
            name = "Cat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.36 35.07c-5.225-2.177-11.248-.993-15.26 3l-.29 .3L187.42 59.58C151.278 36.127 104.722 36.127 68.58 59.58L50.19 38.41l-.29-.3C45.897 34.107 39.878 32.908 34.647 35.073 29.416 37.237 26.004 42.339 26 48v88c0 51.83 45.76 94 102 94 56.24 0 102-42.17 102-94v-88c-.001-5.66-3.411-10.763-8.64-12.93ZM218 136c0 43.38-37.16 79-84 81.81v-23.33l14.24-14.24c2.312-2.347 2.299-6.12-.029-8.451-2.328-2.331-6.101-2.349-8.451-.039L128 183.51 116.24 171.75c-2.35-2.309-6.122-2.292-8.451 .039-2.328 2.331-2.341 6.104-.029 8.451L122 194.48v23.33C75.16 215 38 179.38 38 136v-88c-.028-.816 .467-1.56 1.23-1.85 .26-.107 .539-.164 .82-.17 .468 .003 .917 .182 1.26 .5L63.07 71.48c2.057 2.369 5.592 2.752 8.11 .88C77.009 68.068 83.326 64.483 90 61.68v26.32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-30.49c6.534-1.796 13.236-2.909 20-3.32v33.81c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-33.81c6.764 .411 13.466 1.524 20 3.32v30.49c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26.32c6.676 2.819 12.994 6.421 18.82 10.73 2.518 1.872 6.053 1.489 8.11-.88l21.76-25c.586-.508 1.413-.632 2.122-.317 .709 .315 1.172 1.011 1.188 1.787ZM94 140c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM182 140c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _cat!!
    }

private var _cat: ImageVector? = null
