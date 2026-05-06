package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) return _behanceLogo!!
        _behanceLogo = phosphorBoldIcon(
            name = "BehanceLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M117.82 121.39c10.703-12.442 13.178-29.978 6.337-44.897C117.316 61.575 102.412 52.008 86 52h-54C25.373 52 20 57.373 20 64v128c0 6.627 5.373 12 12 12h58c19.736-.014 37.264-12.615 43.563-31.319 6.299-18.704-.036-39.341-15.743-51.291ZM44 76h42c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18h-42ZM90 180h-46v-44h46c12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22ZM156 76c0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-64c-6.627 0-12-5.373-12-12ZM200 100c-28.719 0-52 23.281-52 52 0 28.719 23.281 52 52 52 7.865 .021 15.631-1.761 22.7-5.21 3.951-1.817 6.609-5.629 6.949-9.964 .34-4.335-1.692-8.515-5.311-10.925-3.619-2.411-8.259-2.675-12.128-.691-3.804 1.849-7.98 2.803-12.21 2.79-10.812-.012-20.655-6.236-25.3-16h65.3c6.627 0 12-5.373 12-12-.033-28.705-23.295-51.967-52-52ZM174.7 140c4.634-9.774 14.483-16.004 25.3-16.004 10.817 0 20.666 6.23 25.3 16.004Z"),
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
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
