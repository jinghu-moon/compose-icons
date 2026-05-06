package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MusicNotes: ImageVector
    get() {
        if (_musicNotes != null) return _musicNotes!!
        _musicNotes = phosphorThinIcon(
            name = "MusicNotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.46 20.85c-.97-.758-2.235-1.028-3.43-.73l-128 32C77.249 52.565 76 54.165 76 56v118.87C65.775 163.276 48.724 160.649 35.484 168.628c-13.24 7.979-18.884 24.282-13.411 38.739 5.474 14.457 20.499 22.934 35.704 20.144C72.982 224.719 84.017 211.459 84 196v-88.88l120-30v65.75c-10.225-11.594-27.276-14.221-40.516-6.242-13.24 7.979-18.884 24.282-13.411 38.739 5.474 14.457 20.499 22.934 35.704 20.144C200.982 192.719 212.017 179.459 212 164v-140c-.001-1.231-.569-2.393-1.54-3.15ZM52 220C38.745 220 28 209.255 28 196c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM180 188c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM84 98.88v-39.76L204 29.12v39.76Z"),
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
        return _musicNotes!!
    }

private var _musicNotes: ImageVector? = null
