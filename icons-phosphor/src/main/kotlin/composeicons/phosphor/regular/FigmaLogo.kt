package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = phosphorRegularIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 96C205.774 85.67 211.392 67.685 205.947 51.351 200.503 35.017 185.217 24 168 24h-72C78.783 24 63.497 35.017 58.053 51.351 52.608 67.685 58.226 85.67 72 96c-10.317 7.732-16.275 19.962-16.003 32.852 .272 12.89 6.739 24.858 17.373 32.148C56.925 173.503 51.392 195.764 60.071 214.511c8.679 18.747 29.232 28.932 49.406 24.482C129.651 234.544 144.012 216.659 144 196v-36c17.673 13.255 42.745 9.673 56-8 13.255-17.673 9.673-42.745-8-56ZM192 64c0 13.255-10.745 24-24 24h-24v-48h24c13.255 0 24 10.745 24 24ZM72 64C72 50.745 82.745 40 96 40h32v48h-32C82.745 88 72 77.255 72 64ZM96 152C82.745 152 72 141.255 72 128c0-13.255 10.745-24 24-24h32v48h-32ZM128 196c0 15.464-12.536 28-28 28C84.536 224 72 211.464 72 196c0-15.464 12.536-28 28-28h28ZM168 152c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24Z"),
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
        return _figmaLogo!!
    }

private var _figmaLogo: ImageVector? = null
