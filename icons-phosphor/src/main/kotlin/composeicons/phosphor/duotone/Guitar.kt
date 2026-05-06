package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Guitar: ImageVector
    get() {
        if (_guitar != null) return _guitar!!
        _guitar = phosphorDuotoneIcon(
            name = "Guitar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M155.2 100.8c-23-23-55.57-27.63-72.8-10.4-3.309 3.324-5.899 7.293-7.61 11.66-2.479 5.966-8.26 9.893-14.72 10C48 112.44 37 116.61 28.8 124.8 7.6 146 13.33 186.12 41.6 214.4c28.27 28.28 68.39 34 89.6 12.8C139.39 219 143.56 208 144 195.93c.107-6.46 4.034-12.241 10-14.72 4.367-1.711 8.336-4.301 11.66-7.61 17.17-17.23 12.51-49.82-10.46-72.8ZM112 168C98.745 168 88 157.255 88 144c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
                pathData = parseSvgPathData("M249.66 46.34l-40-40c-3.126-3.123-8.192-3.121-11.315 .005-3.123 3.126-3.121 8.192 .005 11.315L200.69 20 140.52 80.16C117.73 68.3 92.21 69.29 76.75 84.74c-4.08 4.097-7.276 8.988-9.39 14.37-1.327 2.981-4.287 4.899-7.55 4.89-14.59 .49-27.26 5.72-36.65 15.11C11.08 131.22 6 148.6 8.74 168.07 11.4 186.7 21.07 205.15 36 220c14.93 14.85 33.34 24.56 52 27.22 3.344 .5 6.719 .76 10.1 .78 15.32 0 28.83-5.23 38.76-15.16 9.39-9.39 14.62-22.06 15.11-36.65-.003-3.27 1.927-6.232 4.92-7.55 5.384-2.11 10.275-5.307 14.37-9.39 15.45-15.46 16.44-41 4.58-63.77L236 55.31l2.34 2.34c3.123 3.126 8.189 3.128 11.315 .005 3.126-3.123 3.128-8.189 .005-11.315ZM160 167.93c-2.55 2.539-5.597 4.524-8.95 5.83-8.905 3.669-14.793 12.261-15 21.89-.36 10.46-4 19.41-10.43 25.88-8.44 8.43-21 11.95-35.36 9.89C75 229.25 59.73 221.19 47.27 208.73 34.81 196.27 26.75 181 24.58 165.81c-2-14.37 1.46-26.92 9.89-35.36C40.94 124 49.89 120.37 60.35 120h0c9.63-.202 18.225-6.092 21.89-15 1.3-3.371 3.285-6.435 5.83-9 5.49-5.49 13-8.13 21.38-8.13 6.592 .106 13.097 1.53 19.13 4.19l-20.08 20.13c-16.666 1.835-29.089 16.222-28.476 32.977 .613 16.755 14.054 30.196 30.809 30.809 16.755 .613 31.142-11.811 32.977-28.476l20.08-20.08c6.52 15.29 5.58 30.99-3.89 40.51ZM149.6 106.45c2.114 2.126 4.094 4.38 5.93 6.75l-15.42 15.42c-2.942-5.341-7.339-9.738-12.68-12.68l15.42-15.43c2.353 1.841 4.59 3.825 6.7 5.94ZM112 128c8.837 0 16 7.163 16 16h0c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM160.85 95.15c-2.122-2.114-4.351-4.116-6.68-6L176 67.31 188.69 80l-21.83 21.82c-1.884-2.329-3.886-4.558-6-6.68ZM200 68.68 187.32 56 212 31.31 224.69 44ZM93.66 194.33c3.126 3.123 3.128 8.189 .005 11.315-3.123 3.126-8.189 3.128-11.315 .005l-32-32c-3.123-3.126-3.121-8.192 .005-11.315 3.126-3.123 8.192-3.121 11.315 .005Z"),
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
        return _guitar!!
    }

private var _guitar: ImageVector? = null
