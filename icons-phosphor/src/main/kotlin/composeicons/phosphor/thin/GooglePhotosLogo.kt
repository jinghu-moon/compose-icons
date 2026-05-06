package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) return _googlePhotosLogo!!
        _googlePhotosLogo = phosphorThinIcon(
            name = "GooglePhotosLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 124h-46.32c13.082-20.963 13.762-47.372 1.778-68.981C175.473 33.41 152.71 20.003 128 20c-2.209 0-4 1.791-4 4v46.32C103.037 57.238 76.628 56.558 55.019 68.542 33.41 80.527 20.003 103.29 20 128c0 2.209 1.791 4 4 4h46.32c-13.082 20.963-13.762 47.372-1.778 68.981C80.527 222.59 103.29 235.997 128 236c2.209 0 4-1.791 4-4v-46.32c20.963 13.082 47.372 13.762 68.981 1.778C222.59 175.473 235.997 152.71 236 128c0-2.209-1.791-4-4-4ZM188 88c.053 12.991-4.163 25.639-12 36h-44v-95.87c31.497 2.144 55.963 28.3 56 59.87ZM88 68c12.991-.053 25.639 4.163 36 12v44h-95.87C30.274 92.503 56.43 68.037 88 68ZM68 168c-.053-12.991 4.163-25.639 12-36h44v95.87C92.503 225.726 68.037 199.57 68 168ZM168 188c-12.991 .053-25.639-4.163-36-12v-44h95.87c-2.144 31.497-28.3 55.963-59.87 56Z"),
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
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
