package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ZcoolFill: ImageVector
    get() {
        if (_zcoolFill != null) return _zcoolFill!!
        _zcoolFill = remixIcon(
            name = "ZcoolFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.903 21.839c-4.364 0-7.902-3.538-7.902-7.903 0-3.645 2.467-6.876 5.824-7.627C11.746 5.431 13.529 4.742 14.902 2c.999 1.935 .324 3.71 .001 4.677C19.6 5.548 21.273 3.396 21.676 3.129c0 3.952-1.232 6.452-2.419 8.064 1.476-.055 2.008-.484 2.744-.586-.325 1.448-1.501 3.49-4.331 4.795-.687 3.664-3.903 6.437-7.767 6.437ZM13.613 15.387c0 .323-.053 .484-.403 .484l-3.15 .002 2.961-3.248c.86-.86 .86-1.29 .86-2.388 0-.334-.048-.716 .048-1.051 .048-.143-.048-.191-.191-.143-.334 .096-.908 .096-1.863 .096h-4.298c-.239 0-.334-.143-.239-.334 0-.048 0-.191-.096-.191-.621 .287-.764 1.576-.716 2.388 0 .43 .239 .669 .573 .669h3.391L7.003 15.395c-.239 .287-.478 .669-.478 1.194v1.051c0 .478 .287 .764 .812 .86h5.988c.555 0 .933-.233 .933-.855v-1.129c0-.208 0-.968-.645-1.129Z"),
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
        return _zcoolFill!!
    }

private var _zcoolFill: ImageVector? = null
