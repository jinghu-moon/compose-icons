package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorBoldIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 104v-32C244 60.954 235.046 52 224 52h-192C20.954 52 12 60.954 12 72v32c-5.036 3.777-8 9.705-8 16v48c0 11.046 8.954 20 20 20h4v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h152v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12h4c11.046 0 20-8.954 20-20v-48c0-6.295-2.964-12.223-8-16ZM220 100h-12c-11.046 0-20 8.954-20 20v4h-48v-48h80ZM116 76v48h-48v-4C68 108.954 59.046 100 48 100h-12v-24ZM228 164h-200v-40h16v12c0 6.627 5.373 12 12 12h144c6.627 0 12-5.373 12-12v-12h16Z"),
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
        return _couch!!
    }

private var _couch: ImageVector? = null
