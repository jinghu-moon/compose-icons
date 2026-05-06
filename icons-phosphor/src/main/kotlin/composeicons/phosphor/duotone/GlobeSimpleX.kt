package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GlobeSimpleX: ImageVector
    get() {
        if (_globeSimpleX != null) return _globeSimpleX!!
        _globeSimpleX = phosphorDuotoneIcon(
            name = "GlobeSimpleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M221.66 173.66 203.31 192l18.35 18.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L192 203.31l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L180.69 192 162.34 173.66c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L192 180.69l18.34-18.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32ZM232 128c0 4.418-3.582 8-8 8h-127.75c3 53.73 35.33 80.6 36.77 81.77h0c2.642 2.128 3.654 5.692 2.526 8.891-1.129 3.2-4.153 5.339-7.546 5.339C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.438 0 104 46.562 104 104ZM148.41 42.4C159.94 57.67 174 83.49 175.79 120h39.84C212.141 82.413 185.115 51.214 148.41 42.4ZM128 43c-9.54 9.92-29.46 35.42-31.77 77h63.54C157.46 78.4 137.55 52.9 128 43ZM40.37 120h39.84C82 83.49 96.06 57.67 107.59 42.4 70.885 51.214 43.859 82.413 40.37 120ZM80.21 136h-39.84c3.489 37.587 30.515 68.786 67.22 77.6C96.06 198.33 82 172.51 80.21 136Z"),
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
        return _globeSimpleX!!
    }

private var _globeSimpleX: ImageVector? = null
