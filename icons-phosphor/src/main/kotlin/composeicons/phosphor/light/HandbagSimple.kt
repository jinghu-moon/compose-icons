package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandbagSimple: ImageVector
    get() {
        if (_handbagSimple != null) return _handbagSimple!!
        _handbagSimple = phosphorLightIcon(
            name = "HandbagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.9 198.36l-14.25-120c-.861-7.072-6.876-12.382-14-12.36h-35.65v-2C174 38.595 153.405 18 128 18 102.595 18 82 38.595 82 64v2h-35.67c-7.124-.022-13.139 5.288-14 12.36l-14.25 120c-.47 3.988 .794 7.986 3.472 10.978 2.678 2.992 6.512 4.69 10.528 4.662h191.84c4.015 .028 7.849-1.67 10.528-4.662 2.678-2.992 3.943-6.99 3.472-10.978ZM94 64C94 45.222 109.222 30 128 30c18.778 0 34 15.222 34 34v2h-68ZM225.5 201.3c-.399 .453-.976 .708-1.58 .7h-191.84c-.604 .008-1.181-.247-1.58-.7-.379-.414-.558-.973-.49-1.53L44.27 79.77c.119-1.037 1.017-1.808 2.06-1.77h163.34c1.043-.038 1.941 .733 2.06 1.77l14.26 120c.068 .557-.111 1.116-.49 1.53Z"),
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
        return _handbagSimple!!
    }

private var _handbagSimple: ImageVector? = null
