package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorLightIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 96v112c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-112C209.961 63.983 184.017 38.039 152 38h-48C71.983 38.039 46.039 63.983 46 96v112c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-112C34.044 57.358 65.358 26.044 104 26h48c38.642 .044 69.956 31.358 70 70ZM182 96v72c-.003 11.5-8.863 21.057-20.33 21.93l3.7 7.39c1.48 2.966 .276 6.57-2.69 8.05-2.966 1.48-6.57 .276-8.05-2.69L148.29 190h-40.58l-6.34 12.68c-1.48 2.966-5.084 4.17-8.05 2.69-2.966-1.48-4.17-5.084-2.69-8.05l3.7-7.39C82.863 189.057 74.003 179.5 74 168v-72C74 83.85 83.85 74 96 74h64c12.15 0 22 9.85 22 22ZM86 96v50h84v-50c0-5.523-4.477-10-10-10h-64C90.477 86 86 90.477 86 96ZM118 158v20h20v-20ZM96 178h10v-20h-20v10c0 5.523 4.477 10 10 10ZM170 168v-10h-20v20h10c5.523 0 10-4.477 10-10Z"),
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
        return _subway!!
    }

private var _subway: ImageVector? = null
