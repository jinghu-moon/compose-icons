package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Plane: ImageVector
    get() {
        if (_plane != null) return _plane!!
        _plane = tablerFilledIcon(
            name = "Plane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.868 2.504 16.58 9h3.42c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3h-3.42l-3.712 6.496c-.178 .312-.509 .504-.868 .504h-3c-.314 0-.61-.147-.799-.398-.189-.251-.25-.575-.163-.877L9.674 15h-2.26L5.707 16.707C5.52 16.895 5.265 17 5 17h-3c-.346-0-.668-.18-.85-.474-.182-.295-.199-.663-.044-.973L2.882 12 1.106 8.447C.951 8.137 .968 7.769 1.15 7.474 1.332 7.18 1.654 7 2 7h3c.265 0 .52 .105 .707 .293L7.414 9h2.26L8.038 3.275c-.086-.302-.026-.627 .163-.877C8.39 2.147 8.686 2 9 2h3c.359 0 .69 .192 .868 .504"),
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
        return _plane!!
    }

private var _plane: ImageVector? = null
