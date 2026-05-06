package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SteeringWheel: ImageVector
    get() {
        if (_steeringWheel != null) return _steeringWheel!!
        _steeringWheel = phosphorFillIcon(
            name = "SteeringWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM49.63 168h40.82l17 45.58C82.463 207.524 61.353 190.883 49.63 168ZM128 156c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM148.46 213.59 165.55 168h40.82c-11.739 22.908-32.887 39.556-57.91 45.59ZM128 96c-32.232 .039-63.409 11.493-88 32.33v-.33C40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88v.33C191.409 107.493 160.232 96.039 128 96Z"),
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
        return _steeringWheel!!
    }

private var _steeringWheel: ImageVector? = null
