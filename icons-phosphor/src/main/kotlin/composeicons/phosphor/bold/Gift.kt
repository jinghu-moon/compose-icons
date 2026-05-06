package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = phosphorBoldIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 68h-25.94c3.712-5.399 5.775-11.76 5.94-18.31 .299-10.085-3.576-19.846-10.71-26.98C178.156 15.575 168.395 11.701 158.31 12c-9.317 .199-18.128 4.276-24.31 11.25-2.255 2.573-4.264 5.352-6 8.3-1.736-2.948-3.745-5.727-6-8.3C115.818 16.276 107.007 12.199 97.69 12 87.605 11.701 77.844 15.575 70.71 22.71 63.575 29.844 59.701 39.605 60 49.69c.165 6.55 2.228 12.911 5.94 18.31h-25.94C28.954 68 20 76.954 20 88v32c-.002 9.505 6.687 17.699 16 19.6v60.4c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-60.4c9.313-1.901 16.002-10.095 16-19.6v-32C236 76.954 227.046 68 216 68ZM212 116h-72v-24h72ZM152 39.17c1.789-1.986 4.327-3.135 7-3.17h.35c3.419-.01 6.696 1.368 9.08 3.819 2.384 2.45 3.673 5.764 3.57 9.181-.035 2.673-1.184 5.211-3.17 7-6.9 6.12-18.25 9.26-27.63 10.76C142.7 57.42 145.84 46.07 152 39.17ZM87.7 39.7C90.074 37.352 93.271 36.024 96.61 36h.39c2.673 .035 5.211 1.184 7 3.17 6.12 6.9 9.26 18.24 10.75 27.61C105.45 65.27 94 62.13 87.17 56 85.184 54.211 84.035 51.673 84 49c-.089-3.475 1.248-6.836 3.7-9.3ZM44 92h72v24h-72ZM60 140h56v56h-56ZM140 196v-56h56v56Z"),
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
        return _gift!!
    }

private var _gift: ImageVector? = null
