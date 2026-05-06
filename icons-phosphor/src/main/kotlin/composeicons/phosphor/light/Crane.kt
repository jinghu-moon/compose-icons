package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Crane: ImageVector
    get() {
        if (_crane != null) return _crane!!
        _crane = phosphorLightIcon(
            name = "Crane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.09 18.86c-1.807-1.084-4.05-1.141-5.91-.15L102.5 82h-70.5C24.268 82 18 88.268 18 96v104c0 7.732 6.268 14 14 14h88c7.732 0 14-6.268 14-14v-32c-.003-.582-.087-1.161-.25-1.72L111.16 91 218 34v126c0 1.105-.895 2-2 2h-16c-1.105 0-2-.895-2-2v-8c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v8c0 7.732 6.268 14 14 14h16c7.732 0 14-6.268 14-14v-136c-.001-2.105-1.105-4.056-2.91-5.14ZM99.54 94l20.4 68h-57.94v-68ZM32 94h18v68h-20v-66c0-1.105 .895-2 2-2ZM120 202h-88c-1.105 0-2-.895-2-2v-26h92v26c0 1.105-.895 2-2 2Z"),
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
        return _crane!!
    }

private var _crane: ImageVector? = null
