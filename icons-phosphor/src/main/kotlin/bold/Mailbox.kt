package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorBoldIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 100.000 148.000 C 100.000 154.627 94.627 160.000 88.000 160.000 L 64.000 160.000 C 57.373 160.000 52.000 154.627 52.000 148.000 C 52.000 141.373 57.373 136.000 64.000 136.000 L 88.000 136.000 C 94.627 136.000 100.000 141.373 100.000 148.000 ZM 244.000 116.000 L 244.000 176.000 C 244.000 187.046 235.046 196.000 224.000 196.000 L 140.000 196.000 L 140.000 224.000 C 140.000 230.627 134.627 236.000 128.000 236.000 C 121.373 236.000 116.000 230.627 116.000 224.000 L 116.000 196.000 L 32.000 196.000 C 20.954 196.000 12.000 187.046 12.000 176.000 L 12.000 116.000 C 12.039 80.670 40.670 52.039 76.000 52.000 L 156.000 52.000 L 156.000 24.000 C 156.000 17.373 161.373 12.000 168.000 12.000 L 200.000 12.000 C 206.627 12.000 212.000 17.373 212.000 24.000 C 212.000 30.627 206.627 36.000 200.000 36.000 L 180.000 36.000 L 180.000 52.000 C 215.330 52.039 243.961 80.670 244.000 116.000 ZM 116.000 172.000 L 116.000 116.000 C 116.000 93.909 98.091 76.000 76.000 76.000 C 53.909 76.000 36.000 93.909 36.000 116.000 L 36.000 172.000 ZM 220.000 116.000 C 220.000 93.909 202.091 76.000 180.000 76.000 L 180.000 144.000 C 180.000 150.627 174.627 156.000 168.000 156.000 C 161.373 156.000 156.000 150.627 156.000 144.000 L 156.000 76.000 L 125.930 76.000 C 135.050 87.335 140.016 101.451 140.000 116.000 L 140.000 172.000 L 220.000 172.000 Z"),
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
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
