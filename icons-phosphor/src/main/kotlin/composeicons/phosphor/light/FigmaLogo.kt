package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FigmaLogo: ImageVector
    get() {
        if (_figmaLogo != null) return _figmaLogo!!
        _figmaLogo = phosphorLightIcon(
            name = "FigmaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188.45 96c14.203-9.096 20.711-26.466 15.981-42.656C199.702 37.154 184.866 26.019 168 26h-72C79.134 26.019 64.298 37.154 59.569 53.344 54.839 69.534 61.347 86.904 75.55 96c-11.165 7.148-17.798 19.598-17.502 32.852 .296 13.254 7.478 25.396 18.952 32.038C60.189 171.892 53.524 193.26 61.1 211.868c7.575 18.609 27.269 29.246 46.984 25.379C127.8 233.38 142.016 216.091 142 196v-40.32c10.488 9.981 25.737 13.135 39.324 8.133 13.587-5.002 23.151-17.29 24.664-31.689C207.501 117.725 200.7 103.717 188.45 96ZM194 64c0 14.359-11.641 26-26 26h-26v-52h26c14.359 0 26 11.641 26 26ZM70 64C70 49.641 81.641 38 96 38h34v52h-34C81.641 90 70 78.359 70 64ZM96 154C81.641 154 70 142.359 70 128c0-14.359 11.641-26 26-26h34v52h-34ZM130 196c0 16.569-13.431 30-30 30C83.431 226 70 212.569 70 196c0-16.569 13.431-30 30-30h30ZM168 154c-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26Z"),
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
