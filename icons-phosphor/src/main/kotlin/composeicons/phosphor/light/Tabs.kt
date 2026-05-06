package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tabs: ImageVector
    get() {
        if (_tabs != null) return _tabs!!
        _tabs = phosphorLightIcon(
            name = "Tabs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M253.75 166.28h0 0 0L231.46 92C229.718 86.051 224.249 81.973 218.05 82h-10.05c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10.05c.894-.016 1.691 .564 1.95 1.42L240 162h-35.54l-21-70C181.718 86.051 176.249 81.973 170.05 82h-10.05c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h10.05c.894-.016 1.691 .564 1.95 1.42L192 162h-35.54l-21-70C133.718 86.051 128.249 81.973 122.05 82h-84.05C31.783 81.951 26.288 86.033 24.54 92L2.28 166.2v.05h0v.15c-.043 .127-.076 .258-.1 .39-.004 .016-.004 .034 0 .05-.345 1.749 .106 3.561 1.231 4.945C4.535 173.168 6.217 173.98 8 174h240c1.896 .001 3.681-.895 4.814-2.416 1.133-1.521 1.48-3.487 .936-5.304ZM36 95.42c.264-.875 1.087-1.459 2-1.42h84.1c.879 .007 1.65 .588 1.9 1.43L144 162h-127.94Z"),
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
        return _tabs!!
    }

private var _tabs: ImageVector? = null
