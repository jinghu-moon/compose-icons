package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Eyes: ImageVector
    get() {
        if (_eyes != null) return _eyes!!
        _eyes = phosphorDuotoneIcon(
            name = "Eyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M80 128c0 13.255-10.745 24-24 24C42.745 152 32 141.255 32 128c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24ZM152 104c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24Z"),
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
                pathData = parseSvgPathData("M176 32c-20.61 0-38.28 18.16-48 45.85C118.28 50.16 100.61 32 80 32 48.6 32 24 74.17 24 128c0 53.83 24.6 96 56 96 20.61 0 38.28-18.16 48-45.85 9.72 27.69 27.39 45.85 48 45.85 31.4 0 56-42.17 56-96C232 74.17 207.4 32 176 32ZM106.92 186.39C99.43 200.12 89.62 208 80 208c-9.62 0-19.43-7.88-26.92-21.61C48.238 177.208 44.787 167.357 42.84 157.16c13.428 6.069 29.265 2.183 38.359-9.412 9.094-11.595 9.094-27.901 0-39.497C72.105 96.657 56.268 92.771 42.84 98.84 44.787 88.643 48.238 78.792 53.08 69.61 60.57 55.88 70.38 48 80 48c9.62 0 19.43 7.88 26.92 21.61C115.35 85.07 120 105.81 120 128c0 22.19-4.65 42.93-13.08 58.39ZM40 128c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM202.92 186.39C195.43 200.12 185.62 208 176 208c-9.62 0-19.43-7.88-26.92-21.61-4.842-9.182-8.293-19.033-10.24-29.23 13.428 6.069 29.265 2.183 38.359-9.412 9.094-11.595 9.094-27.901 0-39.497C168.105 96.657 152.268 92.771 138.84 98.84c1.947-10.197 5.398-20.048 10.24-29.23C156.57 55.88 166.38 48 176 48c9.62 0 19.43 7.88 26.92 21.61C211.35 85.07 216 105.81 216 128c0 22.19-4.65 42.93-13.08 58.39ZM136 128c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16Z"),
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
        return _eyes!!
    }

private var _eyes: ImageVector? = null
