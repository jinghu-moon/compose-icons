package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorLightIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 102.000 152.000 C 102.000 155.314 99.314 158.000 96.000 158.000 L 56.000 158.000 C 52.686 158.000 50.000 155.314 50.000 152.000 C 50.000 148.686 52.686 146.000 56.000 146.000 L 96.000 146.000 C 99.314 146.000 102.000 148.686 102.000 152.000 ZM 238.000 116.000 L 238.000 176.000 C 238.000 183.732 231.732 190.000 224.000 190.000 L 134.000 190.000 L 134.000 224.000 C 134.000 227.314 131.314 230.000 128.000 230.000 C 124.686 230.000 122.000 227.314 122.000 224.000 L 122.000 190.000 L 32.000 190.000 C 24.268 190.000 18.000 183.732 18.000 176.000 L 18.000 116.000 C 18.039 83.983 43.983 58.039 76.000 58.000 L 154.000 58.000 L 154.000 24.000 C 154.000 20.686 156.686 18.000 160.000 18.000 L 192.000 18.000 C 195.314 18.000 198.000 20.686 198.000 24.000 C 198.000 27.314 195.314 30.000 192.000 30.000 L 166.000 30.000 L 166.000 58.000 L 180.000 58.000 C 212.017 58.039 237.961 83.983 238.000 116.000 ZM 122.000 178.000 L 122.000 116.000 C 122.000 90.595 101.405 70.000 76.000 70.000 C 50.595 70.000 30.000 90.595 30.000 116.000 L 30.000 176.000 C 30.000 177.105 30.895 178.000 32.000 178.000 ZM 226.000 116.000 C 225.967 90.609 205.391 70.033 180.000 70.000 L 166.000 70.000 L 166.000 144.000 C 166.000 147.314 163.314 150.000 160.000 150.000 C 156.686 150.000 154.000 147.314 154.000 144.000 L 154.000 70.000 L 111.290 70.000 C 125.607 80.963 134.002 97.968 134.000 116.000 L 134.000 178.000 L 224.000 178.000 C 225.105 178.000 226.000 177.105 226.000 176.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
