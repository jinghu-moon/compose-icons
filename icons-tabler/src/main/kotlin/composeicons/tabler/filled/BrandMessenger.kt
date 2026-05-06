package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandMessenger: ImageVector
    get() {
        if (_brandMessenger != null) return _brandMessenger!!
        _brandMessenger = tablerFilledIcon(
            name = "BrandMessenger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.894 5.446c3.667 3.127 4.168 8.238 1.152 11.897-2.842 3.447-7.965 4.583-12.231 2.805l-.233-.101-4.374 .931-.033 .005-.042 .008-.031 .002-.01 .003h-.018L3.022 21l-.024-.001L2.978 21l-.033-.003h-.035l-.022-.004-.022-.002-.035-.007-.034-.005-.016-.004-.024-.005-.049-.016-.024-.005-.011-.005-.022-.007-.045-.02-.03-.012-.011-.006-.014-.006-.031-.018-.045-.024-.016-.011-.037-.026-.04-.027-.015-.013-.043-.04-.025-.02-.062-.07-.013-.013-.011-.014-.027-.04-.026-.035c-.02-.031-.038-.062-.054-.095l-.006-.013-.019-.045-.02-.042-.004-.016-.004-.01-.011-.04-.013-.04-.002-.014-.005-.019-.005-.033-.008-.042-.002-.031-.003-.026L2 20.022l.001-.036 .001-.023 .002-.053 .004-.025v-.019l.008-.036 .005-.033 .004-.017 .005-.023 .018-.06 .003-.013L3.201 16.234l-.022-.037C.969 12.45 1.97 7.805 5.59 5.079l.23-.168C9.718 2.145 15.289 2.371 18.893 5.446M16.831 10.446c-.147-.221-.376-.374-.636-.426-.26-.052-.53 .001-.751 .148l-2.318 1.544L11.706 10.292c-.337-.337-.866-.389-1.262-.124l-3 2c-.221 .147-.374 .376-.426 .636-.052 .26 .002 .53 .149 .751l.07 .093c.329 .387 .895 .466 1.317 .184l2.317-1.545 1.42 1.42c.337 .338 .866 .39 1.263 .125l3-2c.221-.147 .374-.376 .426-.636 .052-.26-.002-.53-.149-.751"),
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
        return _brandMessenger!!
    }

private var _brandMessenger: ImageVector? = null
