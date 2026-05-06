package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceVisionPro: ImageVector
    get() {
        if (_deviceVisionPro != null) return _deviceVisionPro!!
        _deviceVisionPro = tablerOutlineIcon(
            name = "DeviceVisionPro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 7c1.143 0 2.235 .035 3.275 .104 1.017 .068 1.95 .207 2.798 .42 .813 .203 1.52 .505 2.119 .909 .57 .384 1.028 .913 1.328 1.531 .326 .657 .48 1.48 .48 2.466 0 1.006-.189 1.91-.574 2.707-.375 .779-.886 1.396-1.537 1.848-.633 .44-1.389 .671-2.16 .66-.509 0-.97-.068-1.382-.21-.409-.139-.801-.323-1.17-.548-.356-.22-.705-.452-1.045-.695-.32-.231-.654-.442-1.001-.63-.346-.193-.734-.296-1.13-.301-.373 0-.75 .097-1.132 .3-.316 .17-.65 .38-1 .63-.322 .23-.67 .462-1.047 .695-.368 .226-.759 .409-1.168 .548-.413 .142-.872 .21-1.378 .21-.773 .011-1.53-.219-2.165-.659C3.46 16.533 2.949 15.915 2.574 15.137 2.189 14.339 2 13.437 2 12.428c-.004-.98 .15-1.802 .477-2.46C2.777 9.349 3.236 8.821 3.807 8.437c.6-.403 1.307-.704 2.12-.907 .919-.223 1.856-.365 2.8-.423C9.767 7.036 10.857 7 12 7"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _deviceVisionPro!!
    }

private var _deviceVisionPro: ImageVector? = null
