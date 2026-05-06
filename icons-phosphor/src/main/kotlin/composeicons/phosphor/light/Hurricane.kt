package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorLightIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 98c-16.569 0-30 13.431-30 30 0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30C158 111.431 144.569 98 128 98ZM128 146c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM155.91 46.63 165.8 9.54c.538-2.018-.013-4.171-1.454-5.683C162.905 2.345 160.782 1.691 158.74 2.13 138.182 7.182 118.589 15.567 100.74 26.95 62.32 51.66 42 86.6 42 128c.02 36.739 23.349 69.418 58.09 81.37l-9.89 37.08c-.542 2.02 .007 4.176 1.448 5.691 1.441 1.515 3.568 2.17 5.612 1.729 20.558-5.052 40.151-13.437 58-24.82C193.68 204.34 214 169.4 214 128 213.983 91.26 190.652 58.579 155.91 46.63ZM149.05 218.76c-13.88 8.812-28.859 15.762-44.55 20.67l8.68-32.57c.409-1.538 .189-3.176-.609-4.552-.799-1.377-2.112-2.379-3.651-2.788C76.537 190.857 54.011 161.522 54 128 54 90.47 71.82 59.93 107 37.23c13.867-8.802 28.828-15.747 44.5-20.66l-8.68 32.57c-.409 1.538-.189 3.176 .609 4.552 .799 1.377 2.112 2.379 3.651 2.788C179.463 65.143 201.989 94.478 202 128c0 37.53-17.82 68.07-52.95 90.76Z"),
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
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
