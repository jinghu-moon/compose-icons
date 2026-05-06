package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Broadcast: ImageVector
    get() {
        if (_broadcast != null) return _broadcast!!
        _broadcast = phosphorLightIcon(
            name = "Broadcast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 90c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38C166 107.013 148.987 90 128 90ZM128 154c-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26ZM206 128c.025 19.19-7.049 37.712-19.86 52-2.229 2.379-5.95 2.542-8.379 .368-2.429-2.174-2.678-5.89-.561-8.368 22.441-25.041 22.441-62.959 0-88-1.488-1.588-2-3.858-1.337-5.931 .663-2.073 2.397-3.625 4.531-4.054 2.134-.43 4.333 .33 5.746 1.985 12.811 14.288 19.885 32.81 19.86 52ZM67.18 102.31C57.229 125.83 61.756 152.981 78.8 172c2.208 2.469 1.998 6.26-.47 8.47-2.469 2.208-6.26 1.998-8.47-.47C43.345 150.403 43.345 105.597 69.86 76c1.414-1.655 3.613-2.415 5.746-1.985 2.134 .43 3.867 1.981 4.531 4.054 .663 2.073 .151 4.343-1.337 5.931-4.853 5.423-8.779 11.61-11.62 18.31ZM246 128c.031 30.883-12.075 60.541-33.71 82.58-2.32 2.369-6.121 2.41-8.49 .09-2.369-2.32-2.41-6.121-.09-8.49 40.439-41.186 40.439-107.174 0-148.36-2.32-2.369-2.279-6.17 .09-8.49 2.369-2.32 6.17-2.279 8.49 .09C233.925 67.459 246.031 97.117 246 128ZM52.29 202.18c2.32 2.369 2.279 6.17-.09 8.49-2.369 2.32-6.17 2.279-8.49-.09C-1.281 164.719-1.281 91.281 43.71 45.42c2.32-2.369 6.121-2.41 8.49-.09 2.369 2.32 2.41 6.121 .09 8.49-40.439 41.186-40.439 107.174 0 148.36Z"),
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
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
