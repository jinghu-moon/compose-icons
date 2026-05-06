package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tote: ImageVector
    get() {
        if (_tote != null) return _tote!!
        _tote = phosphorLightIcon(
            name = "Tote",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.47 70.73C231.792 67.717 227.951 65.995 223.92 66h-49.92v-2C174 38.595 153.405 18 128 18 102.595 18 82 38.595 82 64v2h-49.92c-4.015-.028-7.849 1.67-10.528 4.662-2.678 2.992-3.943 6.99-3.472 10.978l14.25 120c.861 7.072 6.876 12.382 14 12.36h163.34c7.124 .022 13.139-5.288 14-12.36l14.25-120c.456-3.962-.798-7.931-3.45-10.91ZM94 64C94 45.222 109.222 30 128 30c18.778 0 34 15.222 34 34v2h-68ZM211.73 200.23c-.119 1.037-1.017 1.808-2.06 1.77h-163.34c-1.043 .038-1.941-.733-2.06-1.77L30 80.23c-.068-.557 .111-1.116 .49-1.53 .399-.453 .976-.708 1.58-.7h49.93v26c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26h68v26c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-26h49.92c.604-.008 1.181 .247 1.58 .7 .379 .414 .558 .973 .49 1.53Z"),
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
        return _tote!!
    }

private var _tote: ImageVector? = null
