package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorFillIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188.3 43.31c-.208-.178-.425-.345-.65-.5-.23-.16-.47-.31-.71-.45C140.591 8.857 75.877 19.132 42.186 65.345 8.495 111.557 18.507 176.312 64.583 210.191c46.075 33.879 110.87 24.13 144.936-21.808C243.584 142.446 234.098 77.612 188.3 43.36ZM128 152c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM216 128c0 2.47-.11 4.92-.31 7.34L168 126.92c-.269-9.862-4.189-19.273-11-26.41L184.78 60.84C204.581 77.527 216.006 102.105 216 128Z"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
