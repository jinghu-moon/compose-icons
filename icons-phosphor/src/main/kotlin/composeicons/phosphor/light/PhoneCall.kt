package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = phosphorLightIcon(
            name = "PhoneCall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M146.2 46.45c.41-1.539 1.415-2.851 2.794-3.649 1.379-.797 3.018-1.014 4.556-.601 29.508 7.697 52.553 30.742 60.25 60.25 .412 1.538 .196 3.177-.602 4.556-.797 1.379-2.11 2.384-3.648 2.794-.506 .135-1.027 .202-1.55 .2-2.718 .002-5.098-1.824-5.8-4.45C195.592 80.203 175.797 60.408 150.45 53.8c-1.539-.41-2.851-1.415-3.648-2.794-.797-1.379-1.014-3.018-.602-4.556ZM142.45 85.8C157 89.68 166.32 99 170.2 113.55c.702 2.626 3.082 4.452 5.8 4.45 .523 .002 1.044-.065 1.55-.2 1.539-.41 2.851-1.415 3.648-2.794 .797-1.379 1.014-3.018 .602-4.556-5-18.71-17.54-31.25-36.25-36.25-3.203-.856-6.494 1.047-7.35 4.25-.856 3.203 1.047 6.494 4.25 7.35ZM221.89 182.8C218.346 209.843 195.274 230.05 168 230 89.7 230 26 166.3 26 88 25.948 60.736 46.139 37.668 73.17 34.11c6.179-.751 12.111 2.668 14.56 8.39l21.1 47.1c1.893 4.332 1.471 9.326-1.12 13.28-.129 .198-.269 .388-.42 .57L86.22 128.51c-.259 .526-.259 1.144 0 1.67 7.66 15.68 24.1 32 40 39.65 .538 .245 1.161 .223 1.68-.06l24.69-21c.176-.153 .363-.294 .56-.42 3.936-2.624 8.932-3.083 13.28-1.22l47.24 21.17c5.644 2.501 8.983 8.404 8.22 14.53ZM210 181.32c.069-.858-.419-1.663-1.21-2L161.54 158.15c-.522-.202-1.107-.165-1.6 .1l-24.68 21c-.18 .15-.37 .29-.56 .42-4.095 2.731-9.323 3.11-13.77 1-18.36-8.87-36.66-27-45.53-45.19-2.122-4.42-1.777-9.628 .91-13.73 .129-.201 .273-.391 .43-.57L97.79 96.09c.244-.53 .244-1.14 0-1.67L76.74 47.31C76.456 46.536 75.725 46.015 74.9 46h-.23C53.631 48.799 37.935 66.775 38 88c0 71.68 58.32 130 130 130 21.228 .064 39.206-15.637 42-36.68Z"),
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
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
