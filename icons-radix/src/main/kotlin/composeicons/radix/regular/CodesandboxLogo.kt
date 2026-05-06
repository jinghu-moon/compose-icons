package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = radixIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.711 .797C7.577 .734 7.423 .734 7.289 .797L1.289 3.597C1.113 3.679 1 3.856 1 4.05v6.9c0 .194 .113 .371 .289 .453l6 2.8c.134 .062 .289 .062 .423 0l6-2.8c.176-.082 .289-.259 .289-.453v-6.9c0-.194-.113-.371-.289-.453L7.711 .797ZM7.5 3.157 5.98 2.511 7.5 1.802l1.52 .709L7.5 3.157ZM7.696 4.16 10.238 3.08l2.034 .949L7.5 6.057 2.728 4.029 4.762 3.08 7.304 4.16c.125 .053 .266 .053 .391 0ZM8 6.931 13 4.806v3.124l-1.918 .882c-.355 .163-.582 .518-.582 .908v2.078L8 12.965v-6.034ZM11.5 11.332 13 10.632v-1.601l-1.5 .69v1.611ZM7 6.931v6.034L4.502 11.799v-2.079c0-.391-.227-.745-.582-.908L2 7.929v-3.123L7 6.931ZM2 10.632l1.502 .701v-1.612L2 9.029v1.602Z"),
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
