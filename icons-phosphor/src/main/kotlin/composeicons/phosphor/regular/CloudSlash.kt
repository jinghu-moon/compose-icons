package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorRegularIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L81.32 88.55l-.06 .12C78.193 88.226 75.099 88.002 72 88 36.654 88 8 116.654 8 152c0 35.346 28.654 64 64 64h88c10.877 .021 21.662-1.99 31.8-5.93l10.28 11.31c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM160 200h-88C45.49 200 24 178.51 24 152c0-26.51 21.49-48 48-48 1.1 0 2.2 0 3.3 .12C73.115 111.892 72.004 119.927 72 128c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 .003-9.086 1.72-18.09 5.06-26.54l87 95.7c-6.518 1.892-13.273 2.848-20.06 2.84ZM248 128c.013 21.621-7.945 42.487-22.35 58.61-2.994 2.999-7.807 3.143-10.975 .328-3.168-2.815-3.591-7.612-.965-10.938 24.616-27.493 24.461-69.145-.359-96.454C188.531 52.238 147.083 48.115 117.37 70c-3.559 2.618-8.567 1.854-11.185-1.705-2.618-3.559-1.854-8.567 1.705-11.185 26.732-19.644 62.239-22.586 91.839-7.609C229.329 64.477 247.992 94.827 248 128Z"),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
